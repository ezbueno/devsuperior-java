package membros.estaticos.exercicios.propostos;

public final class CurrencyConverter {
	private CurrencyConverter() {
	}
	
	public static double converterFromDollarsToReais(double currencyPrice, double amount) {
		return (amount + (amount * 0.06)) * currencyPrice;
	}
}
