#include <bits/stdc++.h>

using namespace std;

void div(int* x, int* d, int n) {
	*d += *x / n;
	*x %= n;
}

int main() {
	int x, d = 0;
	cin >> x;
	div(&x, &d, 5);
	div(&x, &d, 4);
	div(&x, &d, 3);
	div(&x, &d, 2);
	div(&x, &d, 1);
	cout << d << "\n";
}