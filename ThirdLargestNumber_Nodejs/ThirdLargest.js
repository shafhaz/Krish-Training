 let arr = [3,4,7,2,9,10];
 let size=arr.length;

    if (size < 3)
    {
        console.log(" Invalid Input ");
       
    }
    

    let first = arr[0];
    for (let i = 1; i < size ; i++)
        if (arr[i] > first)
            first = arr[i];

    let second = arr[0];
    for (let i = 0; i <size ; i++)
        if (arr[i] > second && arr[i] < first)
            second = arr[i];

    let third = arr[0];
    for (let i = 0;i <size ; i++)
        if (arr[i] > third && arr[i] < second)
            third = arr[i];


//     const readline = require("readline");

// const rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout,
// });

// rl.question("What is your name? ", function (answer) {
//     console.log(`Oh, so your name is ${answer}`);
// });


    console.log("Array is ",arr);
    console.log("The third largest number is ",third);


