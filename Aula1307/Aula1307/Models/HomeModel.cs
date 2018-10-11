using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Aula1307.Models
{
    public class HomeModel
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        
        public List<HomeModel> listarNomes()
        {
            HomeModel item = new HomeModel();
            List<HomeModel> lista = new List<HomeModel>();

            item.Id = 1;
            item.Nome = "Mika";
            lista.Add(item);

            item.Id = 2;
            item.Nome = "Sarah";
            lista.Add(item);

            item.Id = 3;
            item.Nome = "Carol";
            lista.Add(item);

            return lista;
        }
       
    }
}
