// 객체 생성
let person = {
    name: 'okjaeook',
    age: 26,
    gender: 'male',
    interests: ['eat', 'music'],
    interests2: { first: 'eat', second: 'music' },
    bio: function () {
        console.log(`${this.name} is ${this.age} years old. he likes ${this.interests[0]} and ${this.interests[1]}.`);
    }
};

// 변수 조회
person.name;
person['name'];
person.interests[1];
person.interests2.second;
person.bio();

person.age = 27;
person['interests'][0] = 'game';
person.bio();

person['interests2']['second'] = 'sleep';
console.log(person['interests2'].second);

// 값 추가
person.heigh = 173;
person['weigh'] = 64;
console.log(person.heigh);

// 값 삭제
delete person.interests2;
console.log(`삭제된 값 조회>${person.interests2}`);

// 객체 참조값 복사
let user = { name: "John" };
let admin = user;

// 객체 병합
let permissions1 = { canView: true };
let permissions2 = { canEdit: true };
Object.assign(user, permissions1, permissions2);

console.log(`user.canEdit>${user.canEdit}`);

//가비지콜렉션
//https://ko.javascript.info/garbage-collection

//메소드 체이닝
let ladder = {
    step: 0,
    up() {
        this.step++;
        return this;
    },
    down() {
        this.step--;
        return this;
    },
    showStep: function () {
        console.log(this.step);
    }
};

ladder.up().up().down().showStep();

// Optional
let a = null;
/*console.log(a.address); // TypeError: Cannot read properties of null*/
console.log(a?.address); // undefined
console.log(a?.address.street); // undefined
delete a?.name;