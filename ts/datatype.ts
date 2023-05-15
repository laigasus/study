/**
 * 참고 : https://typescript-kr.github.io/pages/basic-types.html
 */

// boolean
let isDone: boolean = false;

// 숫자
let decimal: number = 6;
let hex: number = 0xf00d;
let binary: number = 0b1010
let octal: number = 0o744;

// 문자열
let color: string = "ppap";
color = 'papp';

let fullName: string = `Bob Bobbington`;
let age: number = 37;
let sentence1: string = `Hello, my name is ${fullName}.
I'll be ${age + 1} years old next month.`;

let sentence2: string = "Hello, my name is " + fullName + ".\n" +
    "I'll be " + (age + 1) + " years old next month.";

console.log(sentence1);
console.log(sentence2);

// 배열
let list1: number[] = [1, 2, 3];         // 원시 배열
let list2: Array<Number> = [1, 2, 3];    // 제네릭 배열
list1[3] = 4;
list1.push(5);

console.log(list1);

// 튜플
let x: [string, number] = ["PPAP", 10];
console.log(`x[0].substring(0, 2)>${x[0].substring(0, 2)}`);

// enum
enum Color1 { Red, Green, Blue }
let c1: Color1 = Color1.Green;

enum Color2 { Red = 1, Green = 2, Blue = 4 }
let c2: Color2 = Color2.Green;
console.log(`c2>${c2}`);

let colorName: string = Color2[1];
console.log(`colorName>${colorName}`);

// Any -> 자바에서는 Object, instanceof 활용
let notSure: any = 4;

function getMoney(money: any): number {
    let returnMoney = 5;

    if (typeof money === "string") {
        returnMoney += Number.parseInt(money);
        console.log(`입력된 타입>string`);
    }
    else if (typeof money === "number") {
        returnMoney += money;
        console.log(`입력된 타입>number`);
    }
    else {
        throw new Error("Type이 올바르지 않습니다.");
    }

    return returnMoney;
}

notSure = getMoney(notSure);
console.log(`notSure>${notSure}`);

// void

function warnUser(): void {
    console.warn(`void`);
}
warnUser();

let unusable: void = undefined;
//unusable = null; // 성공  `--strictNullChecks` 을 사용하지 않을때만

//Null and Undefined
let u: undefined = undefined;
let n: null = null;

// Never

// never를 반환하는 함수는 함수의 마지막에 도달할 수 없다.
function error(message: string): never {
    throw new Error(message);
}

// 반환 타입이 never로 추론된다.
function fail() {
    return error("failed");
}

// never를 반환하는 함수는 함수의 마지막에 도달할 수 없다.
function infiniteLoop(): never {
    while (true) {
    }
}

// 객체
type simpleObj = {

}