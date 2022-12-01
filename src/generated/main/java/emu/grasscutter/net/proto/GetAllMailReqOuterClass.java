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
import com.google.protobuf.Internal;
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

public final class GetAllMailReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetAllMailReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetAllMailReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetAllMailReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetAllMailReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013GetAllMailReq.proto\",\n\rGetAllMailReq\u0012\u001b\n\u0013Unk2700_OPEHLDAGICF\u0018\u0007 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetAllMailReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetAllMailReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetAllMailReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetAllMailReqOuterClass.internal_static_GetAllMailReq_descriptor, new String[] { "Unk2700OPEHLDAGICF" });
    }
    
    public static final class GetAllMailReq extends GeneratedMessageV3 implements GetAllMailReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_OPEHLDAGICF_FIELD_NUMBER = 7;
        private boolean unk2700OPEHLDAGICF_;
        private byte memoizedIsInitialized;
        private static final GetAllMailReq DEFAULT_INSTANCE;
        private static final Parser<GetAllMailReq> PARSER;
        
        private GetAllMailReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetAllMailReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetAllMailReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetAllMailReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.unk2700OPEHLDAGICF_ = input.readBool();
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
            return GetAllMailReqOuterClass.internal_static_GetAllMailReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetAllMailReqOuterClass.internal_static_GetAllMailReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAllMailReq.class, Builder.class);
        }
        
        @Override
        public boolean getUnk2700OPEHLDAGICF() {
            return this.unk2700OPEHLDAGICF_;
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
            if (this.unk2700OPEHLDAGICF_) {
                output.writeBool(7, this.unk2700OPEHLDAGICF_);
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
            if (this.unk2700OPEHLDAGICF_) {
                size += CodedOutputStream.computeBoolSize(7, this.unk2700OPEHLDAGICF_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAllMailReq)) {
                return super.equals(obj);
            }
            final GetAllMailReq other = (GetAllMailReq)obj;
            return this.getUnk2700OPEHLDAGICF() == other.getUnk2700OPEHLDAGICF() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700OPEHLDAGICF());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetAllMailReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetAllMailReq.PARSER.parseFrom(data);
        }
        
        public static GetAllMailReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAllMailReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAllMailReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetAllMailReq.PARSER.parseFrom(data);
        }
        
        public static GetAllMailReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAllMailReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAllMailReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetAllMailReq.PARSER.parseFrom(data);
        }
        
        public static GetAllMailReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAllMailReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAllMailReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAllMailReq.PARSER, input);
        }
        
        public static GetAllMailReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAllMailReq.PARSER, input, extensionRegistry);
        }
        
        public static GetAllMailReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetAllMailReq.PARSER, input);
        }
        
        public static GetAllMailReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetAllMailReq.PARSER, input, extensionRegistry);
        }
        
        public static GetAllMailReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAllMailReq.PARSER, input);
        }
        
        public static GetAllMailReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAllMailReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetAllMailReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetAllMailReq prototype) {
            return GetAllMailReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetAllMailReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetAllMailReq getDefaultInstance() {
            return GetAllMailReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetAllMailReq> parser() {
            return GetAllMailReq.PARSER;
        }
        
        @Override
        public Parser<GetAllMailReq> getParserForType() {
            return GetAllMailReq.PARSER;
        }
        
        @Override
        public GetAllMailReq getDefaultInstanceForType() {
            return GetAllMailReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetAllMailReq();
            PARSER = new AbstractParser<GetAllMailReq>() {
                @Override
                public GetAllMailReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetAllMailReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetAllMailReqOrBuilder
        {
            private boolean unk2700OPEHLDAGICF_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetAllMailReqOuterClass.internal_static_GetAllMailReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetAllMailReqOuterClass.internal_static_GetAllMailReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAllMailReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetAllMailReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk2700OPEHLDAGICF_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetAllMailReqOuterClass.internal_static_GetAllMailReq_descriptor;
            }
            
            @Override
            public GetAllMailReq getDefaultInstanceForType() {
                return GetAllMailReq.getDefaultInstance();
            }
            
            @Override
            public GetAllMailReq build() {
                final GetAllMailReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetAllMailReq buildPartial() {
                final GetAllMailReq result = new GetAllMailReq(this);
                result.unk2700OPEHLDAGICF_ = this.unk2700OPEHLDAGICF_;
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
                if (other instanceof GetAllMailReq) {
                    return this.mergeFrom((GetAllMailReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetAllMailReq other) {
                if (other == GetAllMailReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk2700OPEHLDAGICF()) {
                    this.setUnk2700OPEHLDAGICF(other.getUnk2700OPEHLDAGICF());
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
                GetAllMailReq parsedMessage = null;
                try {
                    parsedMessage = GetAllMailReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetAllMailReq)e.getUnfinishedMessage();
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
            public boolean getUnk2700OPEHLDAGICF() {
                return this.unk2700OPEHLDAGICF_;
            }
            
            public Builder setUnk2700OPEHLDAGICF(final boolean value) {
                this.unk2700OPEHLDAGICF_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700OPEHLDAGICF() {
                this.unk2700OPEHLDAGICF_ = false;
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
    
    public interface GetAllMailReqOrBuilder extends MessageOrBuilder
    {
        boolean getUnk2700OPEHLDAGICF();
    }
}
