#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, m, i = 0;
	cin >> n >> m;
	while (n--) {
		++i;
		if (i % m == 0) {
			n++;
		}
	}
	cout << i << "\n";
}