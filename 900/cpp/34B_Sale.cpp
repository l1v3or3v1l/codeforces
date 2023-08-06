#include <bits/stdc++.h>

using namespace std;

void sort (int a[], int n) {
	for (int i = 0; i < n - 1; i++) {
		for (int j = 0; j < n - i - 1; j++) {
			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
}

int main() {
	int n, m, c(0), v;
	cin >> n >> m;
	int a[n]{0};
	for (int i = 0; i < n; i++) {
		cin >> v;
		if (v < 0) {
			a[i] = v;
		}
	}
	sort(a, n);
	for (int i = 0; i < m; i++) {
		c += a[i];			
	}
	cout << abs(c) << "\n";
}