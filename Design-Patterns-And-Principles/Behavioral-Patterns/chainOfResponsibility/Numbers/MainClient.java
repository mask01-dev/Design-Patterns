package chainOfResponsibility.Numbers;

public class MainClient {
	public static void main(String[] args) {
		Chain chain1 = new AddNumbers();
		Chain chain2 = new SubtractNumbers();
		Chain chain3 = new MultipleNumbers();
		Chain chain4 = new DivNumbers();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		Numbers request = new Numbers(4, 2, "pow");
		chain1.calculate(request);
		
	}
}