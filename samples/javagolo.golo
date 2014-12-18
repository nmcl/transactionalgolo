module example.golo

import Dummy

function main = |args| {

	 doDummy()

	 let foobar = Dummy()

	 println(foobar: toString())

	 println("Value is "+VALUE())

	 let conf = map[
   	      ["extends", "Dummy"],
   	      ["implements", map[
      	      		     ["foobar", |this, res| {
        		     return true
     			     }]
    		]]
 	]

	let fabric = AdapterFabric()
 	let dummyMaker = fabric: maker(conf)
  	let dummy = dummyMaker: newInstance()

	callFoobar(dummy)
}