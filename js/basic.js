let num = 1;
let str = "123";
let numArr = [7, 2, 6];

for (let i = 0; i < numArr.length; i++) {
    console.log(numArr[i]);
}

let strArr = ["abc", "def", "ghi"]
strArr.forEach(function (s) {
    console.log(s);
});

let mapArr = { 'a': 1, 'b': 2, 'c': 3 }

for (let i = 0; i < mapArr.length; i++) {
    console.log(mapArr[i]);
}

// 출력
process.stdout.write("print without newline...");
console.log("simple print ");
console.log(`print variable> ${str}`);

//형변환
console.log(typeof (str));
console.log(typeof (Number(str)));

// 연산
let x = 2, y = 3;

console.log(`x + y>${x + y}`);
console.log(`x - y>${x - y}`);
console.log(`result ${'i' + 's'} ${x + y}`);
console.log(Number(str) == str);
console.log(Number(str) === str);
console.log(`x * y>${x * y}`);
console.log(`x ** y>${x ** y}`);
console.log(`x % y>${x % y}`);
console.log(`x / y>${x / y}`);
console.log(`x += 2>${x += 2}`);
console.log(x++);
console.log(x);

let commaop = (1 + 2, 3 + 4);
console.log(`commaop>${commaop}`);

// 조건문
if (6 % 3 == 0) {
    console.log("yes3");
} else if (6 % 2 == 0) {
    console.log("yes2");
} else {
    console.log("no");
}

// switch
let a = 3;
switch (a) {
    case 4:
        console.log('계산이 맞습니다!');
        break;

    case 3: // (*) 두 case문을 묶음
    case 5:
        console.log('계산이 틀립니다!');
        console.log("수학 수업을 다시 들어보는걸 권유 드립니다.");
        break;

    default:
        console.log('계산 결과가 이상하네요.');
}

//삼항 연산
console.log(`삼항연산>${x == y ? 'yes' : 'no'}`)

let age = 10
let msg = (age < 3) ? '아기야 안녕?' :
    (age < 18) ? '안녕!' :
        (age < 100) ? '환영합니다!' :
            '나이가 아주 많으시거나, 나이가 아닌 값을 입력 하셨군요!';

console.log(msg);

// 함수
var c = 1;
function init() {
    console.log('함수 시작');
}
function returnNum() {
    return 6;
}

function simpleFunc(d, e = 20, f = returnNum()) {
    init();
    console.log(`c=${c}`);
    console.log(`d=${d}`);
    d = 1;
    console.log(`d=${d}`);
    console.log(`e=${e}`);
    console.log(`f=${f}`);
}

simpleFunc(5);

// 콜백 함수
let welcome;

if (age < 18) {
    welcome = function () {
        console.log("안녕!");
    };
} else {
    welcome = function () {
        console.log("안녕하세요!");
    };
}

welcome();

// 화살표 함수

let welcome2 = (age < 18) ?
    () => console.log('안녕?') :
    () => console.log("안녕하세요?");

welcome2();