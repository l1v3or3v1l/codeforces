#include <iostream>

int main() {
    int m, n, in;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            std::cin >> in;
            if (in == 1) {
                m = i;
                n = j;
                break;
            }
        }
    }
    std::cout << abs(m-2) + abs(n-2);
}