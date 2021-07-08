#include"Polynomial.h"
#include<iostream>
#include<string>
using namespace std;

Polynomial::Polynomial()
{
	for (int x = 0; x < 11; x++)
	{
		coeff[x] = 0;
	}
	degree = 0;
}

Polynomial::Polynomial(int c[], int d)
{
	for (int x = 0; x <=d ; x++)
	{
		coeff[x] = c[x];
	}
	for (int x = d + 1; x <= 10; x++)
	{
		coeff[x] = 0;
	}
	if(d >= 0) degree = d;
}

Polynomial Polynomial::operator+(Polynomial &right)
{
	Polynomial ans;

	ans.degree = (degree > right.degree ? degree : right.degree);

	for (int x = 0; x <= ans.degree; x++)
	{
		ans.coeff[x] = coeff[x] + right.coeff[x];
	}

	return ans;
}

Polynomial Polynomial::operator-(Polynomial &right)
{

	Polynomial ans;

	ans.degree = (degree > right.degree ? degree : right.degree);

	for (int x = 0; x <= ans.degree; x++)
	{
		ans.coeff[x] = coeff[x] - right.coeff[x];
	}

	return ans;
}

Polynomial Polynomial::operator*(Polynomial &right)
{
  Polynomial ans;
  ans.degree = (right.degree+degree-2);

  for (int i = 0; i<degree+right.degree-1; i++) 
    ans.coeff[i] = 0;
    
   for (int i=0; i<=degree; i++) 
   { 
     for (int j=0; j<=right.degree; j++) 
         ans.coeff[i+j] += coeff[i]*right.coeff[j];
   } 
  return ans;
}

Polynomial Polynomial::operator=(Polynomial &right)
{

	for (int x = 0; x <= right.degree; x++)
	{
		coeff[x] = right.coeff[x];
	}
	degree = right.degree;

	return Polynomial(coeff, degree);

}

ostream &operator<<(ostream &output, Polynomial &right)
/*
{
    for (int i=ans.degree; i>=0; i--) 
    if(ans.coeff[i] != 0)
    { 
       output << ans.coeff[i]; 
       if (i != 0) 
        output << "x^" << i ; 
       if (i != ans.degree-1) 
       output << " + "; 
    }
    return output;
}
*/
{
	string xDeg[11] = { "", "x", "x^2", "x^3", "x^4", "x^5", "x^6", "x^7", "x^8", "x^9", "x^10" }, ans;

	if (right.coeff[right.degree] > 0) output << right.coeff[right.degree] << xDeg[right.degree];

	for (int x = right.degree+1; x>= 0; x--)
	{
		/*if (right.coeff[x] == right.degree+2)
			ans.append(to_string(right.coeff[x]) + xDeg[x]);*/
		if (right.coeff[x] > 0)
			ans.append("+" + to_string(right.coeff[x]) + xDeg[x]);
		else if (right.coeff[x] < 0)
			ans.append(to_string(right.coeff[x]) + xDeg[x]);
	}

	output << ans;
	return output;
}
