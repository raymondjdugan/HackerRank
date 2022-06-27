function minMaxSum(arr) {
    let min = 0;
    let max = 0;

    arr.sort().forEach((num, i) => {
        if (i < arr.length - 1) {
            min += num;
        }
        if (i > 0) {
            max += num;
        }
    })
    console.log(min, max)
}

minMaxSum([7, 69, 2, 221, 8974]);
