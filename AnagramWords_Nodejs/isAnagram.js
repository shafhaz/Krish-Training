//Solution 1

let isAnagrams1 = (s,t) =>{

    s=s.toUpperCase();
    t=t.toUpperCase()

    s=s.split('').sort().join('');
    t=t.split('').sort().join('');

    if(s==t){
        return "This two words are Anagram\n";
      
    }
    else{
        return "This two words are not an Anagram";
    }
};

console.log(
    isAnagrams1('Dog','God'),
    isAnagrams1('Shafhaz','Haneef')
);