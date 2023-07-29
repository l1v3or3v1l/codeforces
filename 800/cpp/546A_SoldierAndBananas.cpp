#include <bits/stdc++.h>

using namespace std;

int main() {
	int k, n, w;
	cin >> k;
	cin >> n;
	cin >> w;
	cout << max(0, (k * ( w * (w + 1) / 2 ) - n)) << "\n";
}