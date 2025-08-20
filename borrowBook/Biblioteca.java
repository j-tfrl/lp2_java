class Biblioteca{
    Livro ini;
    Livro prox;
    //int totalAcervo;
    int totalAlunosB; //total de alunos com emp.
    //Livro[] acv; //acervo de livros
    Usuario lista_u;
    Livro lista_l;
    Emprestimo var;
    
    void InsListadeLivros(int c, int q, String t, String a){
        Livro novol=new Livro(c,q,t,a);
        novol.prox=ini;
        ini=novol;
        novol.qtd++;
    }

    void InsListadeAlunos(String n, int m){
        Usuario novou=new Usuario(n, m);
        novou.prox=ini;
        ini=novou;
        novou.qtd++;
    }


    int sqUSearch(Usuario lista_u, Usuario proc){
        for (int i=0; i<lista_u.qtd; i++){
            if(lista_u[i]==proc){
                return i;
            }
        }

        System.out.println(proc+" Usuário não encontrado!\n");
        return -1;
    }


    int sqLSearch(Livro lista_l, Livro proc){
        for (int i=0; i<lista_l.qtd; i++){
            if(lista_l[i]==proc){
                return i;
            }
        }

        System.out.println(proc+" Livro não encontrado!\n");
        return -1;
    }


    void exibir(){
        Livro at=ini;
        while(at!=null){
            System.out.println(at.titulo+"-->");
            at=at.prox; //mostrar que livros foram emprestados
        }
        System.out.println();

        if(var.emp==true){
            //impl: mostra a lista com o nome do usuário associado
        }else{
            //o livro não emprestado deve vir com 'S/E'
            // S/E -> sem empréstimo atual
        }
    }



}