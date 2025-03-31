import api from "./api";

export const criarTransacao = async (clienteId) => {
  const payload = {
    valor: Math.floor(Math.random() * 10000) + 1,
    descricao: "Compra",
    tipo: "d"
  };

  const response = await api.post(`/clientes/${clienteId}/transacoes`, payload);
  return response.data;
};
