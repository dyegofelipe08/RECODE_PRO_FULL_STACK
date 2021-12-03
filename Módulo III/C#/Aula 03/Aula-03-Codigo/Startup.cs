using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;

namespace AspnCore2Empty
{
	public class Startup
	{
		public IConfiguration _config { get; set; }

		public Startup()
		{
			var builder = new ConfigurationBuilder()
				
				// define o caminho do diretório
				.SetBasePath(Directory.GetCurrentDirectory())
				
				// provedor de configuração JSON
				.AddJsonFile("appsettings.json");

			// cria a estrutura de configuracao
			_config = builder.Build();
		}

		// This method gets called by the runtime. Use this method to add services to the container.
		// For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
		public void ConfigureServices(IServiceCollection services)
		{
		}

		// This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
		public void Configure(IApplicationBuilder app, IHostingEnvironment env)
		{
			if (env.IsDevelopment())
			{ 
				app.UseDeveloperExceptionPage();
			}

			app.Run(async (context) =>
			{
				var mensagem = _config["Mensagem"];
				var conexao = _config["ConnectionStrings:DefaultConnection"];

				await context.Response.WriteAsync(mensagem);
			});
		}
	}
}


