function getRandomInt(max, min) {
    if(min != null){
        let dif = max - min
        let rawNum = Math.floor(Math.random() * dif);
        return rawNum + min
    }
    return Math.floor(Math.random() * max);
}