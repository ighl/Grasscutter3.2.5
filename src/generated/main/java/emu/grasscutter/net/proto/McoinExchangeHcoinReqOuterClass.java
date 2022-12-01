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

public final class McoinExchangeHcoinReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_McoinExchangeHcoinReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_McoinExchangeHcoinReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private McoinExchangeHcoinReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return McoinExchangeHcoinReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bMcoinExchangeHcoinReq.proto\":\n\u0015McoinExchangeHcoinReq\u0012\r\n\u0005hcoin\u0018\u0005 \u0001(\r\u0012\u0012\n\nmcoin_cost\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        McoinExchangeHcoinReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_McoinExchangeHcoinReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_McoinExchangeHcoinReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_descriptor, new String[] { "Hcoin", "McoinCost" });
    }
    
    public static final class McoinExchangeHcoinReq extends GeneratedMessageV3 implements McoinExchangeHcoinReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int HCOIN_FIELD_NUMBER = 5;
        private int hcoin_;
        public static final int MCOIN_COST_FIELD_NUMBER = 1;
        private int mcoinCost_;
        private byte memoizedIsInitialized;
        private static final McoinExchangeHcoinReq DEFAULT_INSTANCE;
        private static final Parser<McoinExchangeHcoinReq> PARSER;
        
        private McoinExchangeHcoinReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private McoinExchangeHcoinReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new McoinExchangeHcoinReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private McoinExchangeHcoinReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.mcoinCost_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.hcoin_ = input.readUInt32();
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
            return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_fieldAccessorTable.ensureFieldAccessorsInitialized(McoinExchangeHcoinReq.class, Builder.class);
        }
        
        @Override
        public int getHcoin() {
            return this.hcoin_;
        }
        
        @Override
        public int getMcoinCost() {
            return this.mcoinCost_;
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
            if (this.mcoinCost_ != 0) {
                output.writeUInt32(1, this.mcoinCost_);
            }
            if (this.hcoin_ != 0) {
                output.writeUInt32(5, this.hcoin_);
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
            if (this.mcoinCost_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.mcoinCost_);
            }
            if (this.hcoin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.hcoin_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof McoinExchangeHcoinReq)) {
                return super.equals(obj);
            }
            final McoinExchangeHcoinReq other = (McoinExchangeHcoinReq)obj;
            return this.getHcoin() == other.getHcoin() && this.getMcoinCost() == other.getMcoinCost() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getHcoin();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMcoinCost();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static McoinExchangeHcoinReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinReq.PARSER.parseFrom(data);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinReq.PARSER.parseFrom(data);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinReq.PARSER.parseFrom(data);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return McoinExchangeHcoinReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(McoinExchangeHcoinReq.PARSER, input);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(McoinExchangeHcoinReq.PARSER, input, extensionRegistry);
        }
        
        public static McoinExchangeHcoinReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(McoinExchangeHcoinReq.PARSER, input);
        }
        
        public static McoinExchangeHcoinReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(McoinExchangeHcoinReq.PARSER, input, extensionRegistry);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(McoinExchangeHcoinReq.PARSER, input);
        }
        
        public static McoinExchangeHcoinReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(McoinExchangeHcoinReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return McoinExchangeHcoinReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final McoinExchangeHcoinReq prototype) {
            return McoinExchangeHcoinReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == McoinExchangeHcoinReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static McoinExchangeHcoinReq getDefaultInstance() {
            return McoinExchangeHcoinReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<McoinExchangeHcoinReq> parser() {
            return McoinExchangeHcoinReq.PARSER;
        }
        
        @Override
        public Parser<McoinExchangeHcoinReq> getParserForType() {
            return McoinExchangeHcoinReq.PARSER;
        }
        
        @Override
        public McoinExchangeHcoinReq getDefaultInstanceForType() {
            return McoinExchangeHcoinReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new McoinExchangeHcoinReq();
            PARSER = new AbstractParser<McoinExchangeHcoinReq>() {
                @Override
                public McoinExchangeHcoinReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new McoinExchangeHcoinReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements McoinExchangeHcoinReqOrBuilder
        {
            private int hcoin_;
            private int mcoinCost_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_fieldAccessorTable.ensureFieldAccessorsInitialized(McoinExchangeHcoinReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (McoinExchangeHcoinReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.hcoin_ = 0;
                this.mcoinCost_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return McoinExchangeHcoinReqOuterClass.internal_static_McoinExchangeHcoinReq_descriptor;
            }
            
            @Override
            public McoinExchangeHcoinReq getDefaultInstanceForType() {
                return McoinExchangeHcoinReq.getDefaultInstance();
            }
            
            @Override
            public McoinExchangeHcoinReq build() {
                final McoinExchangeHcoinReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public McoinExchangeHcoinReq buildPartial() {
                final McoinExchangeHcoinReq result = new McoinExchangeHcoinReq(this);
                result.hcoin_ = this.hcoin_;
                result.mcoinCost_ = this.mcoinCost_;
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
                if (other instanceof McoinExchangeHcoinReq) {
                    return this.mergeFrom((McoinExchangeHcoinReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final McoinExchangeHcoinReq other) {
                if (other == McoinExchangeHcoinReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getHcoin() != 0) {
                    this.setHcoin(other.getHcoin());
                }
                if (other.getMcoinCost() != 0) {
                    this.setMcoinCost(other.getMcoinCost());
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
                McoinExchangeHcoinReq parsedMessage = null;
                try {
                    parsedMessage = McoinExchangeHcoinReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (McoinExchangeHcoinReq)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface McoinExchangeHcoinReqOrBuilder extends MessageOrBuilder
    {
        int getHcoin();
        
        int getMcoinCost();
    }
}
