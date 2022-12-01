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

public final class GetBattlePassProductReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetBattlePassProductReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetBattlePassProductReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetBattlePassProductReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetBattlePassProductReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dGetBattlePassProductReq.proto\"@\n\u0017GetBattlePassProductReq\u0012%\n\u001dbattle_pass_product_play_type\u0018\n \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetBattlePassProductReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetBattlePassProductReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetBattlePassProductReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetBattlePassProductReqOuterClass.internal_static_GetBattlePassProductReq_descriptor, new String[] { "BattlePassProductPlayType" });
    }
    
    public static final class GetBattlePassProductReq extends GeneratedMessageV3 implements GetBattlePassProductReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BATTLE_PASS_PRODUCT_PLAY_TYPE_FIELD_NUMBER = 10;
        private int battlePassProductPlayType_;
        private byte memoizedIsInitialized;
        private static final GetBattlePassProductReq DEFAULT_INSTANCE;
        private static final Parser<GetBattlePassProductReq> PARSER;
        
        private GetBattlePassProductReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetBattlePassProductReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetBattlePassProductReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetBattlePassProductReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            this.battlePassProductPlayType_ = input.readUInt32();
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
            return GetBattlePassProductReqOuterClass.internal_static_GetBattlePassProductReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetBattlePassProductReqOuterClass.internal_static_GetBattlePassProductReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetBattlePassProductReq.class, Builder.class);
        }
        
        @Override
        public int getBattlePassProductPlayType() {
            return this.battlePassProductPlayType_;
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
            if (this.battlePassProductPlayType_ != 0) {
                output.writeUInt32(10, this.battlePassProductPlayType_);
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
            if (this.battlePassProductPlayType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.battlePassProductPlayType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetBattlePassProductReq)) {
                return super.equals(obj);
            }
            final GetBattlePassProductReq other = (GetBattlePassProductReq)obj;
            return this.getBattlePassProductPlayType() == other.getBattlePassProductPlayType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getBattlePassProductPlayType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetBattlePassProductReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetBattlePassProductReq.PARSER.parseFrom(data);
        }
        
        public static GetBattlePassProductReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetBattlePassProductReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetBattlePassProductReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetBattlePassProductReq.PARSER.parseFrom(data);
        }
        
        public static GetBattlePassProductReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetBattlePassProductReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetBattlePassProductReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetBattlePassProductReq.PARSER.parseFrom(data);
        }
        
        public static GetBattlePassProductReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetBattlePassProductReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetBattlePassProductReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetBattlePassProductReq.PARSER, input);
        }
        
        public static GetBattlePassProductReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetBattlePassProductReq.PARSER, input, extensionRegistry);
        }
        
        public static GetBattlePassProductReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetBattlePassProductReq.PARSER, input);
        }
        
        public static GetBattlePassProductReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetBattlePassProductReq.PARSER, input, extensionRegistry);
        }
        
        public static GetBattlePassProductReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetBattlePassProductReq.PARSER, input);
        }
        
        public static GetBattlePassProductReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetBattlePassProductReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetBattlePassProductReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetBattlePassProductReq prototype) {
            return GetBattlePassProductReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetBattlePassProductReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetBattlePassProductReq getDefaultInstance() {
            return GetBattlePassProductReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetBattlePassProductReq> parser() {
            return GetBattlePassProductReq.PARSER;
        }
        
        @Override
        public Parser<GetBattlePassProductReq> getParserForType() {
            return GetBattlePassProductReq.PARSER;
        }
        
        @Override
        public GetBattlePassProductReq getDefaultInstanceForType() {
            return GetBattlePassProductReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetBattlePassProductReq();
            PARSER = new AbstractParser<GetBattlePassProductReq>() {
                @Override
                public GetBattlePassProductReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetBattlePassProductReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetBattlePassProductReqOrBuilder
        {
            private int battlePassProductPlayType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetBattlePassProductReqOuterClass.internal_static_GetBattlePassProductReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetBattlePassProductReqOuterClass.internal_static_GetBattlePassProductReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetBattlePassProductReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetBattlePassProductReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.battlePassProductPlayType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetBattlePassProductReqOuterClass.internal_static_GetBattlePassProductReq_descriptor;
            }
            
            @Override
            public GetBattlePassProductReq getDefaultInstanceForType() {
                return GetBattlePassProductReq.getDefaultInstance();
            }
            
            @Override
            public GetBattlePassProductReq build() {
                final GetBattlePassProductReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetBattlePassProductReq buildPartial() {
                final GetBattlePassProductReq result = new GetBattlePassProductReq(this);
                result.battlePassProductPlayType_ = this.battlePassProductPlayType_;
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
                if (other instanceof GetBattlePassProductReq) {
                    return this.mergeFrom((GetBattlePassProductReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetBattlePassProductReq other) {
                if (other == GetBattlePassProductReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getBattlePassProductPlayType() != 0) {
                    this.setBattlePassProductPlayType(other.getBattlePassProductPlayType());
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
                GetBattlePassProductReq parsedMessage = null;
                try {
                    parsedMessage = GetBattlePassProductReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetBattlePassProductReq)e.getUnfinishedMessage();
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
            public int getBattlePassProductPlayType() {
                return this.battlePassProductPlayType_;
            }
            
            public Builder setBattlePassProductPlayType(final int value) {
                this.battlePassProductPlayType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBattlePassProductPlayType() {
                this.battlePassProductPlayType_ = 0;
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
    
    public interface GetBattlePassProductReqOrBuilder extends MessageOrBuilder
    {
        int getBattlePassProductPlayType();
    }
}
