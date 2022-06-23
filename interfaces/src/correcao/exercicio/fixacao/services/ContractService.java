package correcao.exercicio.fixacao.services;

import java.util.Calendar;
import java.util.Date;

import correcao.exercicio.fixacao.entities.Contract;
import correcao.exercicio.fixacao.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService() {
	}

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + this.onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota + this.onlinePaymentService.paymentFee(updatedQuota);

			Date dueDate = this.addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}
}
