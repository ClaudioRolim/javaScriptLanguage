const numberPrime = [];
function calcPrimeNumber(num)
{
	let divisors = 0;
	for(let count = 1; count <= num; count++)
	{
		const rest = num % count;
		if(rest == 0)
		{
			divisors++;
	        }
		else if(divisors > 2)
		{
			break;
		}
	}
		if(divisors == 2)
		{
			numberPrime.push(num);
		}
}
let sumPrime = 0;
let i;
for(i = 1; i <= 1000; i++)
{
    calcPrimeNumber(i);
}
for(i = 0; i < numberPrime.length; i++)
{
    sumPrime += numberPrime[i];
}
console.log(numberPrime);
console.log("Sum of all prime numbers is: " + sumPrime);
