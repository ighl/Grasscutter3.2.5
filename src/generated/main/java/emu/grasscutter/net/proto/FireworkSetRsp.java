// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class FireworkSetRsp
{
    private static final Descriptors.Descriptor internal_static_NBFJOJPCCEK_Rsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NBFJOJPCCEK_Rsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FireworkSetRsp() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireworkSetRsp.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014FireworkSetRsp.proto\"\"\n\u000fNBFJOJPCCEK_Rsp\u0012\u000f\n\u0007retcode\u0018\u0007 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireworkSetRsp.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_NBFJOJPCCEK_Rsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_NBFJOJPCCEK_Rsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FireworkSetRsp.internal_static_NBFJOJPCCEK_Rsp_descriptor, new String[] { "Retcode" });
    }
    
    public static final class NBFJOJPCCEK_Rsp extends GeneratedMessageV3 implements NBFJOJPCCEK_RspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 7;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final NBFJOJPCCEK_Rsp DEFAULT_INSTANCE;
        private static final Parser<NBFJOJPCCEK_Rsp> PARSER;
        
        private NBFJOJPCCEK_Rsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private NBFJOJPCCEK_Rsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new NBFJOJPCCEK_Rsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private NBFJOJPCCEK_Rsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 56: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FireworkSetRsp.internal_static_NBFJOJPCCEK_Rsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FireworkSetRsp.internal_static_NBFJOJPCCEK_Rsp_fieldAccessorTable.ensureFieldAccessorsInitialized(NBFJOJPCCEK_Rsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.retcode_ != 0) {
                output.writeInt32(7, this.retcode_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(7, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NBFJOJPCCEK_Rsp)) {
                return super.equals(obj);
            }
            final NBFJOJPCCEK_Rsp other = (NBFJOJPCCEK_Rsp)obj;
            return this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return NBFJOJPCCEK_Rsp.PARSER.parseFrom(data);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NBFJOJPCCEK_Rsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return NBFJOJPCCEK_Rsp.PARSER.parseFrom(data);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NBFJOJPCCEK_Rsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return NBFJOJPCCEK_Rsp.PARSER.parseFrom(data);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NBFJOJPCCEK_Rsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NBFJOJPCCEK_Rsp.PARSER, input);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NBFJOJPCCEK_Rsp.PARSER, input, extensionRegistry);
        }
        
        public static NBFJOJPCCEK_Rsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(NBFJOJPCCEK_Rsp.PARSER, input);
        }
        
        public static NBFJOJPCCEK_Rsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(NBFJOJPCCEK_Rsp.PARSER, input, extensionRegistry);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NBFJOJPCCEK_Rsp.PARSER, input);
        }
        
        public static NBFJOJPCCEK_Rsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NBFJOJPCCEK_Rsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return NBFJOJPCCEK_Rsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final NBFJOJPCCEK_Rsp prototype) {
            return NBFJOJPCCEK_Rsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == NBFJOJPCCEK_Rsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static NBFJOJPCCEK_Rsp getDefaultInstance() {
            return NBFJOJPCCEK_Rsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<NBFJOJPCCEK_Rsp> parser() {
            return NBFJOJPCCEK_Rsp.PARSER;
        }
        
        @Override
        public Parser<NBFJOJPCCEK_Rsp> getParserForType() {
            return NBFJOJPCCEK_Rsp.PARSER;
        }
        
        @Override
        public NBFJOJPCCEK_Rsp getDefaultInstanceForType() {
            return NBFJOJPCCEK_Rsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new NBFJOJPCCEK_Rsp();
            PARSER = new AbstractParser<NBFJOJPCCEK_Rsp>() {
                @Override
                public NBFJOJPCCEK_Rsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new NBFJOJPCCEK_Rsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NBFJOJPCCEK_RspOrBuilder
        {
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FireworkSetRsp.internal_static_NBFJOJPCCEK_Rsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FireworkSetRsp.internal_static_NBFJOJPCCEK_Rsp_fieldAccessorTable.ensureFieldAccessorsInitialized(NBFJOJPCCEK_Rsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (NBFJOJPCCEK_Rsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FireworkSetRsp.internal_static_NBFJOJPCCEK_Rsp_descriptor;
            }
            
            @Override
            public NBFJOJPCCEK_Rsp getDefaultInstanceForType() {
                return NBFJOJPCCEK_Rsp.getDefaultInstance();
            }
            
            @Override
            public NBFJOJPCCEK_Rsp build() {
                final NBFJOJPCCEK_Rsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public NBFJOJPCCEK_Rsp buildPartial() {
                final NBFJOJPCCEK_Rsp result = new NBFJOJPCCEK_Rsp(this);
                result.retcode_ = this.retcode_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof NBFJOJPCCEK_Rsp) {
                    return this.mergeFrom((NBFJOJPCCEK_Rsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final NBFJOJPCCEK_Rsp other) {
                if (other == NBFJOJPCCEK_Rsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                NBFJOJPCCEK_Rsp parsedMessage = null;
                try {
                    parsedMessage = NBFJOJPCCEK_Rsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (NBFJOJPCCEK_Rsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface NBFJOJPCCEK_RspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
    }
}
