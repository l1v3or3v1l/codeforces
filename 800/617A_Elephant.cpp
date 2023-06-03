#include <iostream>
using namespace std;

int main() {
	int x, steps=0;
	cin >> x;
	
	int i = 6;
	while(--i) {
		steps+=(x/i);
		x%=i;
	}
	
	cout << steps;
	return 0;
}
