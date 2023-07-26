#include <bits/stdc++.h>

using namespace std;

int main() {
	int t;
	cin >> t;
	string n;
	while (t--) {
		cin >> n;
		if (n.length() > 10) {
			cout << n.at(0) << n.length() - 2 << n.at(n.length() - 1) << "\n";
		} else {
			cout << n << "\n";
		}
	}
}