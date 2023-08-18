#include <bits/stdc++.h>

using namespace std;

int main() {
	int t, n, tmp;
	cin >> t;
	while (t--) {
		cin >> n;
		tmp = n;
		int c = 0;
		while (n != 1 && n != 0 && n > 0) {
			if (n % 6 != 0) {
				n *= 2;
				c++;
			} else {
				n /= 6;
				c++;
			}
		}
		if (n > tmp || n < 0) {
			cout << -1 << "\n";
		} else {
			cout << c << "\n";
		}
	}
}