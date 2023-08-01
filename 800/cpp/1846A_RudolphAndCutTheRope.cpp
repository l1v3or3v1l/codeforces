#include <bits/stdc++.h>

using namespace std;

int main() {
	int t, n, a, b, c;
	cin >> t;
	while (t--) {
		cin >> n;
		c = 0;
		while (n--) {
			cin >> a >> b;
			if (a - b > 0) {
				c++;
			}
		}
		cout << c << "\n";
	}
}