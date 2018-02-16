export class Task {
    public id: number;
    public nome: string;
    public finalizado: boolean;
    public dataVencimento: string;

    constructor(id: number, nome: string, finalizado: boolean, dataVencimento: string){
        this.id = id;
        this.nome = nome;
        this.finalizado = finalizado;
        this.dataVencimento = dataVencimento;
    }

}