/**
 * 출처 https://ko.javascript.info/symbol 
 * */

let id = Symbol("id");

let id1 = Symbol("id");
let id2 = Symbol("id");

console.log(id1 == id2); // false

let user = {
  name: "John",
  age: 30,
  [id]: 123
};

for (let key in user) alert(key); // name과 age만 출력되고, 심볼은 출력되지 않습니다.

// 심볼로 직접 접근하면 잘 작동합니다.
console.log( "직접 접근한 값: " + user[id] );

// 동일한 이름을 이용해 심볼을 다시 읽습니다(좀 더 멀리 떨어진 코드에서도 가능합니다).
let idAgain = Symbol.for("id");

// 두 심볼은 같습니다.
alert( id === idAgain ); // true