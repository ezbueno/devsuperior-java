package exercicio.fixacao.model.services;

import static java.time.ZoneId.systemDefault;
import static java.util.Date.from;

import java.time.LocalDate;

import exercicio.fixacao.model.entities.Contract;
import exercicio.fixacao.model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService() {
	}

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;

		LocalDate localDate = contract.getDate().toInstant().atZone(systemDefault()).toLocalDate();

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = localDate.plusMonths(i);

			double updatedQuota = basicQuota + this.onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota + this.onlinePaymentService.paymentFee(updatedQuota);

			contract.getInstallments().add(new Installment(from(dueDate.atStartOfDay(systemDefault()).toInstant()), fullQuota));
		}
	}
}
