public class Practice01MathIterative implements Practice01Math
{

	public int fib (int n) throws Exception {
		int f = 1;
		int pf = 1;
		if (n <= 1) {
			return n;
		}
		for (int i=2; i<n; ++i) {
			int temp = f;
			f += pf;
			pf = temp;
		}
		return f;
	}

	public int fact (int n) throws Exception {
		int f = 1;
		if (n >= 1) {
			for (int i=1; i<=n; i++) {
				f *= i;
			}
		}
		else {
			throw new IllegalArgumentException();
		}
		return f;
	}

}