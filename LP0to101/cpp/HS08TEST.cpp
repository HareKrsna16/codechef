#include <bits/stdc++.h>
using namespace std;

int main() {
	int x;
	double y;
	cin >> x >> y;
	cout << fixed << setprecision(2);
	if (x%5 == 0 && y-x-0.5>=0)
		cout << y-x-0.50 << endl;
	else
		cout << y << endl;
}
