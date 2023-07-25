#include <bits/stdc++.h>

using namespace std;
using ll = long long;

ll lucky(ll n) {
	int c = 0;
	while (n != 0) {
		int l = n % 10;
		if (l == 4 || l == 7) {
			c++;
		}
		n /= 10;
	}
	return c;
}

int main() {
	ll n;
	cin >> n;
	ll c  = lucky(n);
	if (c >= 10) {
		if (lucky(c) == to_string(c).length()) {
			cout << "YES\n";
		} else {
			cout << "NO\n";
		}
	} else if (c == 4 || c == 7) {
		cout << "YES\n";
	} else {
		cout << "NO\n";
	}
}