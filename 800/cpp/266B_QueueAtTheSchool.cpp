#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, s;
	cin >> n >> s;
	char ch[n];
	for (int i = 0; i < n; i++) {
		cin >> ch[i];
	}
	while (s--) {
		for (int i = 0; i < n - 1; i++) {
			if (ch[i] == 'B' && ch[i + 1] == 'G') {
				ch[i] = 'G';
				ch[i + 1] = 'B';
				i++;
			}
		}
	}
	for (int i = 0; i < n; i++){
		cout << ch[i];
	}
	cout << "\n";
}