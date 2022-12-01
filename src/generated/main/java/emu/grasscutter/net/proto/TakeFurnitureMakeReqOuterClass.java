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

public final class TakeFurnitureMakeReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeFurnitureMakeReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeFurnitureMakeReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeFurnitureMakeReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeFurnitureMakeReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aTakeFurnitureMakeReq.proto\"N\n\u0014TakeFurnitureMakeReq\u0012\r\n\u0005index\u0018\b \u0001(\r\u0012\u0016\n\u000eis_fast_finish\u0018\f \u0001(\b\u0012\u000f\n\u0007make_id\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeFurnitureMakeReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TakeFurnitureMakeReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeFurnitureMakeReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_descriptor, new String[] { "Index", "IsFastFinish", "MakeId" });
    }
    
    public static final class TakeFurnitureMakeReq extends GeneratedMessageV3 implements TakeFurnitureMakeReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int INDEX_FIELD_NUMBER = 8;
        private int index_;
        public static final int IS_FAST_FINISH_FIELD_NUMBER = 12;
        private boolean isFastFinish_;
        public static final int MAKE_ID_FIELD_NUMBER = 7;
        private int makeId_;
        private byte memoizedIsInitialized;
        private static final TakeFurnitureMakeReq DEFAULT_INSTANCE;
        private static final Parser<TakeFurnitureMakeReq> PARSER;
        
        private TakeFurnitureMakeReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakeFurnitureMakeReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeFurnitureMakeReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeFurnitureMakeReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.makeId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.index_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.isFastFinish_ = input.readBool();
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
            return TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeFurnitureMakeReq.class, Builder.class);
        }
        
        @Override
        public int getIndex() {
            return this.index_;
        }
        
        @Override
        public boolean getIsFastFinish() {
            return this.isFastFinish_;
        }
        
        @Override
        public int getMakeId() {
            return this.makeId_;
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
            if (this.makeId_ != 0) {
                output.writeUInt32(7, this.makeId_);
            }
            if (this.index_ != 0) {
                output.writeUInt32(8, this.index_);
            }
            if (this.isFastFinish_) {
                output.writeBool(12, this.isFastFinish_);
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
            if (this.makeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.makeId_);
            }
            if (this.index_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.index_);
            }
            if (this.isFastFinish_) {
                size += CodedOutputStream.computeBoolSize(12, this.isFastFinish_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakeFurnitureMakeReq)) {
                return super.equals(obj);
            }
            final TakeFurnitureMakeReq other = (TakeFurnitureMakeReq)obj;
            return this.getIndex() == other.getIndex() && this.getIsFastFinish() == other.getIsFastFinish() && this.getMakeId() == other.getMakeId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getIndex();
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFastFinish());
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getMakeId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeFurnitureMakeReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeReq.PARSER.parseFrom(data);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeReq.PARSER.parseFrom(data);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeReq.PARSER.parseFrom(data);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeFurnitureMakeReq.PARSER, input);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeFurnitureMakeReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeFurnitureMakeReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeFurnitureMakeReq.PARSER, input);
        }
        
        public static TakeFurnitureMakeReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeFurnitureMakeReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeFurnitureMakeReq.PARSER, input);
        }
        
        public static TakeFurnitureMakeReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeFurnitureMakeReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeFurnitureMakeReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeFurnitureMakeReq prototype) {
            return TakeFurnitureMakeReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeFurnitureMakeReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeFurnitureMakeReq getDefaultInstance() {
            return TakeFurnitureMakeReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeFurnitureMakeReq> parser() {
            return TakeFurnitureMakeReq.PARSER;
        }
        
        @Override
        public Parser<TakeFurnitureMakeReq> getParserForType() {
            return TakeFurnitureMakeReq.PARSER;
        }
        
        @Override
        public TakeFurnitureMakeReq getDefaultInstanceForType() {
            return TakeFurnitureMakeReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeFurnitureMakeReq();
            PARSER = new AbstractParser<TakeFurnitureMakeReq>() {
                @Override
                public TakeFurnitureMakeReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeFurnitureMakeReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeFurnitureMakeReqOrBuilder
        {
            private int index_;
            private boolean isFastFinish_;
            private int makeId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeFurnitureMakeReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakeFurnitureMakeReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.index_ = 0;
                this.isFastFinish_ = false;
                this.makeId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_descriptor;
            }
            
            @Override
            public TakeFurnitureMakeReq getDefaultInstanceForType() {
                return TakeFurnitureMakeReq.getDefaultInstance();
            }
            
            @Override
            public TakeFurnitureMakeReq build() {
                final TakeFurnitureMakeReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeFurnitureMakeReq buildPartial() {
                final TakeFurnitureMakeReq result = new TakeFurnitureMakeReq(this);
                result.index_ = this.index_;
                result.isFastFinish_ = this.isFastFinish_;
                result.makeId_ = this.makeId_;
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
                if (other instanceof TakeFurnitureMakeReq) {
                    return this.mergeFrom((TakeFurnitureMakeReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeFurnitureMakeReq other) {
                if (other == TakeFurnitureMakeReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getIndex() != 0) {
                    this.setIndex(other.getIndex());
                }
                if (other.getIsFastFinish()) {
                    this.setIsFastFinish(other.getIsFastFinish());
                }
                if (other.getMakeId() != 0) {
                    this.setMakeId(other.getMakeId());
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
                TakeFurnitureMakeReq parsedMessage = null;
                try {
                    parsedMessage = TakeFurnitureMakeReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeFurnitureMakeReq)e.getUnfinishedMessage();
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
            public int getIndex() {
                return this.index_;
            }
            
            public Builder setIndex(final int value) {
                this.index_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIndex() {
                this.index_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsFastFinish() {
                return this.isFastFinish_;
            }
            
            public Builder setIsFastFinish(final boolean value) {
                this.isFastFinish_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFastFinish() {
                this.isFastFinish_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMakeId() {
                return this.makeId_;
            }
            
            public Builder setMakeId(final int value) {
                this.makeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMakeId() {
                this.makeId_ = 0;
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
    
    public interface TakeFurnitureMakeReqOrBuilder extends MessageOrBuilder
    {
        int getIndex();
        
        boolean getIsFastFinish();
        
        int getMakeId();
    }
}
