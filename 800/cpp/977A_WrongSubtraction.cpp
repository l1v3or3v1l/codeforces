#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
	ll n; int k;
	cin >> n >> k;
	while (k--) {
		if (n % 10 == 0) {
			n /= 10;
		} else {
			n--;
		}
	}
	cout << n << "\n";
}