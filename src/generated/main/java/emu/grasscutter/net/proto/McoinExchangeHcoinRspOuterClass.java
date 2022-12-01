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

public final class McoinExchangeHcoinRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_McoinExchangeHcoinRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_McoinExchangeHcoinRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private McoinExchangeHcoinRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return McoinExchangeHcoinRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bMcoinExchangeHcoinRsp.proto\"K\n\u0015McoinExchangeHcoinRsp\u0012\u0012\n\nmcoin_cost\u0018\b \u0001(\r\u0012\r\n\u0005hcoin\u0018\u0007 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        McoinExchangeHcoinRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_McoinExchangeHcoinRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_McoinExchangeHcoinRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor, new String[] { "McoinCost", "Hcoin", "Retcode" });
    }
    
    public static final class McoinExchangeHcoinRsp extends GeneratedMessageV3 implements McoinExchangeHcoinRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MCOIN_COST_FIELD_NUMBER = 8;
        private int mcoinCost_;
        public static final int HCOIN_FIELD_NUMBER = 7;
        private int hcoin_;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final McoinExchangeHcoinRsp DEFAULT_INSTANCE;
        private static final Parser<McoinExchangeHcoinRsp> PARSER;
        
        private McoinExchangeHcoinRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private McoinExchangeHcoinRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new McoinExchangeHcoinRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private McoinExchangeHcoinRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 56: {
                            this.hcoin_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.mcoinCost_ = input.readUInt32();
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
            return McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(McoinExchangeHcoinRsp.class, Builder.class);
        }
        
        @Override
        public int getMcoinCost() {
            return this.mcoinCost_;
        }
        
        @Override
        public int getHcoin() {
            return this.hcoin_;
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
                output.writeInt32(4, this.retcode_);
            }
            if (this.hcoin_ != 0) {
                output.writeUInt32(7, this.hcoin_);
            }
            if (this.mcoinCost_ != 0) {
                output.writeUInt32(8, this.mcoinCost_);
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
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
            if (this.hcoin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.hcoin_);
            }
            if (this.mcoinCost_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.mcoinCost_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof McoinExchangeHcoinRsp)) {
                return super.equals(obj);
            }
            final McoinExchangeHcoinRsp other = (McoinExchangeHcoinRsp)obj;
            return this.getMcoinCost() == other.getMcoinCost() && this.getHcoin() == other.getHcoin() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getMcoinCost();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getHcoin();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinRsp.PARSER.parseFrom(data);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinRsp.PARSER.parseFrom(data);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinRsp.PARSER.parseFrom(data);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(McoinExchangeHcoinRsp.PARSER, input);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(McoinExchangeHcoinRsp.PARSER, input, extensionRegistry);
        }
        
        public static McoinExchangeHcoinRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(McoinExchangeHcoinRsp.PARSER, input);
        }
        
        public static McoinExchangeHcoinRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(McoinExchangeHcoinRsp.PARSER, input, extensionRegistry);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(McoinExchangeHcoinRsp.PARSER, input);
        }
        
        public static McoinExchangeHcoinRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(McoinExchangeHcoinRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return McoinExchangeHcoinRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final McoinExchangeHcoinRsp prototype) {
            return McoinExchangeHcoinRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == McoinExchangeHcoinRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static McoinExchangeHcoinRsp getDefaultInstance() {
            return McoinExchangeHcoinRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<McoinExchangeHcoinRsp> parser() {
            return McoinExchangeHcoinRsp.PARSER;
        }
        
        @Override
        public Parser<McoinExchangeHcoinRsp> getParserForType() {
            return McoinExchangeHcoinRsp.PARSER;
        }
        
        @Override
        public McoinExchangeHcoinRsp getDefaultInstanceForType() {
            return McoinExchangeHcoinRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new McoinExchangeHcoinRsp();
            PARSER = new AbstractParser<McoinExchangeHcoinRsp>() {
                @Override
                public McoinExchangeHcoinRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new McoinExchangeHcoinRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements McoinExchangeHcoinRspOrBuilder
        {
            private int mcoinCost_;
            private int hcoin_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(McoinExchangeHcoinRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (McoinExchangeHcoinRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.mcoinCost_ = 0;
                this.hcoin_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
            }
            
            @Override
            public McoinExchangeHcoinRsp getDefaultInstanceForType() {
                return McoinExchangeHcoinRsp.getDefaultInstance();
            }
            
            @Override
            public McoinExchangeHcoinRsp build() {
                final McoinExchangeHcoinRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public McoinExchangeHcoinRsp buildPartial() {
                final McoinExchangeHcoinRsp result = new McoinExchangeHcoinRsp(this);
                result.mcoinCost_ = this.mcoinCost_;
                result.hcoin_ = this.hcoin_;
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
                if (other instanceof McoinExchangeHcoinRsp) {
                    return this.mergeFrom((McoinExchangeHcoinRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final McoinExchangeHcoinRsp other) {
                if (other == McoinExchangeHcoinRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getMcoinCost() != 0) {
                    this.setMcoinCost(other.getMcoinCost());
                }
                if (other.getHcoin() != 0) {
                    this.setHcoin(other.getHcoin());
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
                McoinExchangeHcoinRsp parsedMessage = null;
                try {
                    parsedMessage = McoinExchangeHcoinRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (McoinExchangeHcoinRsp)e.getUnfinishedMessage();
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
            public int getMcoinCost() {
                return this.mcoinCost_;
            }
            
            public Builder setMcoinCost(final int value) {
                this.mcoinCost_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMcoinCost() {
                this.mcoinCost_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getHcoin() {
                return this.hcoin_;
            }
            
            public Builder setHcoin(final int value) {
                this.hcoin_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHcoin() {
                this.hcoin_ = 0;
                this.onChanged();
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
    
    public interface McoinExchangeHcoinRspOrBuilder extends MessageOrBuilder
    {
        int getMcoinCost();
        
        int getHcoin();
        
        int getRetcode();
    }
}
