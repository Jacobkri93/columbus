function getRandomInt(max, min) {
    if(min != null){
        let dif = max - min
        let rawNum = Math.ceil(Math.random() * dif);
        return rawNum + min
    }
    return Math.ceil(Math.random() * max);
}