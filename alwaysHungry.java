function alwaysHungry(arr)
{
	var counter = arr.length;
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]=='food')
		{
			console.log("yummy");
		}
		else
		{
			counter=counter-1;
		}
	}
	
	if (counter == 0)
	{
		console.log("I'm hungry");
	}
}
