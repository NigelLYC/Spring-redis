/**
 * Created by Nigel on 2019/5/13 0013.
 */


function stack(){
    var items = [];

    this.push = function(item){
        items.push(item);
    };

    this.pop = function(){
        return items.pop();
    };

    this.top = function(){
        return items[items.length - 1];
    };

    this.isEmpty = function(){
      return items.length == 0;
    };

    this.size = function(){
        return items.length;
    }

    this.clear = function(){

    }
}
