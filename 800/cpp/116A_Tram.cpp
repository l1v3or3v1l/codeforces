#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, p = 0, en, ex, maxp = 0;
	cin >> n;
	while (n--) {
		cin >> ex >> en;
		p -= ex;
		p += en;
		maxp = max(p, maxp);
	}
	cout << maxp << "\n";
}