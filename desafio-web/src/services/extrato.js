import api from "./api";

export const getExtrato = async (clienteId) => {
  const response = await api.get(`/clientes/${clienteId}/extrato`);
  return response.data;
};
