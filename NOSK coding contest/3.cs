using System;

class MainClass{
	public static void Main(string[] args){
		string input = Console.ReadLine();
		string output = "";

		foreach(char c in input){
			if(c >= '0' && c <= '9'){
				output += c;
			}
		}

		Console.WriteLine(output);
	}
}