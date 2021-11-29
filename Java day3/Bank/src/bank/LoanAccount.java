package bank;

public interface LoanAccount extends Account {
	//repayPrincipal (),payInterest (),payPartialPrincipal ()
	public void repayPrincipal();
	public void payInterest();
	public void payPartialPrincipal();
}