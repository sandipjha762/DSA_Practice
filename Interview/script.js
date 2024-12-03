
var value = 0;
this.add(val) {
    value += val;
    return this;
};

this.subtract(val) {
    value -= val;
    return this;
}
console.log(this.add());

// add(2).add(5).subtract(3).value;