function inheritsMultipleObjects(baseObject, superObjects) {
  return new Proxy(
    baseObject,
    {
      get(target, key, rec) {
        if (Reflect.ownKeys(target).includes(key)) {
          return Reflect.get(target, key);
        }
        const parent = superObjects.find(
          _parent => Reflect.has(_parent, key)
        );
        if (parent !== undefined) {
          return Reflect.get(parent, key);
        }
        return undefined;
      },
      has(target, key) {
        if (Reflect.ownKeys(target).includes(key)) {
          return true;
        }
        const parentHasKey = superObjects.some(
          _parent => Reflect.has(_parent, key)
        );
        if (parentHasKey) {
          return true;
        }
        return false;
      }
    }
  );
}

class Vehicle {
  getDistance() {
    return 100;
  }
}
class Machine {
  getVelocity() {
    return 50;
  }
}
class Truck {}
const _truck = new Truck();
const truck = inheritsMultipleObjects(
  _truck,
  [Truck.prototype,Vehicle.prototype, Machine.prototype]
);
console.log(truck.getDistance()); 
console.log(truck.getVelocity()); 
console.log(truck.constructor); 