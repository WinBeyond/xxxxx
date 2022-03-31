// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.5.0
// source: Axxxx.proto

package xxx

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// AxxxxClient is the client API for Axxxx service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AxxxxClient interface {
	SayHello(ctx context.Context, in *HelloRequest, opts ...grpc.CallOption) (*HelloReply, error)
}

type axxxxClient struct {
	cc grpc.ClientConnInterface
}

func NewAxxxxClient(cc grpc.ClientConnInterface) AxxxxClient {
	return &axxxxClient{cc}
}

func (c *axxxxClient) SayHello(ctx context.Context, in *HelloRequest, opts ...grpc.CallOption) (*HelloReply, error) {
	out := new(HelloReply)
	err := c.cc.Invoke(ctx, "/xxxx.xxx.Axxxx/SayHello", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AxxxxServer is the server API for Axxxx service.
// All implementations must embed UnimplementedAxxxxServer
// for forward compatibility
type AxxxxServer interface {
	SayHello(context.Context, *HelloRequest) (*HelloReply, error)
	mustEmbedUnimplementedAxxxxServer()
}

// UnimplementedAxxxxServer must be embedded to have forward compatible implementations.
type UnimplementedAxxxxServer struct {
}

func (UnimplementedAxxxxServer) SayHello(context.Context, *HelloRequest) (*HelloReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SayHello not implemented")
}
func (UnimplementedAxxxxServer) mustEmbedUnimplementedAxxxxServer() {}

// UnsafeAxxxxServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AxxxxServer will
// result in compilation errors.
type UnsafeAxxxxServer interface {
	mustEmbedUnimplementedAxxxxServer()
}

func RegisterAxxxxServer(s grpc.ServiceRegistrar, srv AxxxxServer) {
	s.RegisterService(&Axxxx_ServiceDesc, srv)
}

func _Axxxx_SayHello_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HelloRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AxxxxServer).SayHello(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/xxxx.xxx.Axxxx/SayHello",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AxxxxServer).SayHello(ctx, req.(*HelloRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Axxxx_ServiceDesc is the grpc.ServiceDesc for Axxxx service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Axxxx_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "xxxx.xxx.Axxxx",
	HandlerType: (*AxxxxServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "SayHello",
			Handler:    _Axxxx_SayHello_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "Axxxx.proto",
}