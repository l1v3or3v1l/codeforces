#include <iostream>
#include <string>

int main() {
    std::string s;
    std::cin >> s;
    std::cout << (char)toupper(s[0]) << s.substr(1);
}
