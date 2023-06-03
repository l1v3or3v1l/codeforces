#include <iostream>

int main() {
    int n, a, b, c, count = 0;
    std::cin >> n;
    while(n-- != 0) {
        std::cin >> a >> b >> c;
        if (a+b+c > 1) {
            count++;
        }
    }
    std::cout << count;
}