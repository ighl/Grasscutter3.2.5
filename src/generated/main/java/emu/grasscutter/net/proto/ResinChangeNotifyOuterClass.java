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

public final class ResinChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ResinChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ResinChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ResinChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ResinChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017ResinChangeNotify.proto\"Y\n\u0011ResinChangeNotify\u0012\u001a\n\u0012next_add_timestamp\u0018\u0006 \u0001(\r\u0012\u0015\n\rcur_buy_count\u0018\u0004 \u0001(\r\u0012\u0011\n\tcur_value\u0018\f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ResinChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ResinChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ResinChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_descriptor, new String[] { "NextAddTimestamp", "CurBuyCount", "CurValue" });
    }
    
    public static final class ResinChangeNotify extends GeneratedMessageV3 implements ResinChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NEXT_ADD_TIMESTAMP_FIELD_NUMBER = 6;
        private int nextAddTimestamp_;
        public static final int CUR_BUY_COUNT_FIELD_NUMBER = 4;
        private int curBuyCount_;
        public static final int CUR_VALUE_FIELD_NUMBER = 12;
        private int curValue_;
        private byte memoizedIsInitialized;
        private static final ResinChangeNotify DEFAULT_INSTANCE;
        private static final Parser<ResinChangeNotify> PARSER;
        
        private ResinChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ResinChangeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ResinChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ResinChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.curBuyCount_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.nextAddTimestamp_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.curValue_ = input.readUInt32();
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
            return ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ResinChangeNotify.class, Builder.class);
        }
        
        @Override
        public int getNextAddTimestamp() {
            return this.nextAddTimestamp_;
        }
        
        @Override
        public int getCurBuyCount() {
            return this.curBuyCount_;
        }
        
        @Override
        public int getCurValue() {
            return this.curValue_;
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
            if (this.curBuyCount_ != 0) {
                output.writeUInt32(4, this.curBuyCount_);
            }
            if (this.nextAddTimestamp_ != 0) {
                output.writeUInt32(6, this.nextAddTimestamp_);
            }
            if (this.curValue_ != 0) {
                output.writeUInt32(12, this.curValue_);
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
            if (this.curBuyCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.curBuyCount_);
            }
            if (this.nextAddTimestamp_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.nextAddTimestamp_);
            }
            if (this.curValue_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.curValue_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResinChangeNotify)) {
                return super.equals(obj);
            }
            final ResinChangeNotify other = (ResinChangeNotify)obj;
            return this.getNextAddTimestamp() == other.getNextAddTimestamp() && this.getCurBuyCount() == other.getCurBuyCount() && this.getCurValue() == other.getCurValue() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getNextAddTimestamp();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getCurBuyCount();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getCurValue();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ResinChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ResinChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ResinChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ResinChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ResinChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ResinChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ResinChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ResinChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ResinChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ResinChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ResinChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ResinChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ResinChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ResinChangeNotify.PARSER, input);
        }
        
        public static ResinChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ResinChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static ResinChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ResinChangeNotify.PARSER, input);
        }
        
        public static ResinChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ResinChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static ResinChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ResinChangeNotify.PARSER, input);
        }
        
        public static ResinChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ResinChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ResinChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ResinChangeNotify prototype) {
            return ResinChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ResinChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ResinChangeNotify getDefaultInstance() {
            return ResinChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ResinChangeNotify> parser() {
            return ResinChangeNotify.PARSER;
        }
        
        @Override
        public Parser<ResinChangeNotify> getParserForType() {
            return ResinChangeNotify.PARSER;
        }
        
        @Override
        public ResinChangeNotify getDefaultInstanceForType() {
            return ResinChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ResinChangeNotify();
            PARSER = new AbstractParser<ResinChangeNotify>() {
                @Override
                public ResinChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ResinChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResinChangeNotifyOrBuilder
        {
            private int nextAddTimestamp_;
            private int curBuyCount_;
            private int curValue_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ResinChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ResinChangeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.nextAddTimestamp_ = 0;
                this.curBuyCount_ = 0;
                this.curValue_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_descriptor;
            }
            
            @Override
            public ResinChangeNotify getDefaultInstanceForType() {
                return ResinChangeNotify.getDefaultInstance();
            }
            
            @Override
            public ResinChangeNotify build() {
                final ResinChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ResinChangeNotify buildPartial() {
                final ResinChangeNotify result = new ResinChangeNotify(this);
                result.nextAddTimestamp_ = this.nextAddTimestamp_;
                result.curBuyCount_ = this.curBuyCount_;
                result.curValue_ = this.curValue_;
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
                if (other instanceof ResinChangeNotify) {
                    return this.mergeFrom((ResinChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ResinChangeNotify other) {
                if (other == ResinChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getNextAddTimestamp() != 0) {
                    this.setNextAddTimestamp(other.getNextAddTimestamp());
                }
                if (other.getCurBuyCount() != 0) {
                    this.setCurBuyCount(other.getCurBuyCount());
                }
                if (other.getCurValue() != 0) {
                    this.setCurValue(other.getCurValue());
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
                ResinChangeNotify parsedMessage = null;
                try {
                    parsedMessage = ResinChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ResinChangeNotify)e.getUnfinishedMessage();
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
            public int getNextAddTimestamp() {
                return this.nextAddTimestamp_;
            }
            
            public Builder setNextAddTimestamp(final int value) {
                this.nextAddTimestamp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextAddTimestamp() {
                this.nextAddTimestamp_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurBuyCount() {
                return this.curBuyCount_;
            }
            
            public Builder setCurBuyCount(final int value) {
                this.curBuyCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurBuyCount() {
                this.curBuyCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurValue() {
                return this.curValue_;
            }
            
            public Builder setCurValue(final int value) {
                this.curValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurValue() {
                this.curValue_ = 0;
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
    
    public interface ResinChangeNotifyOrBuilder extends MessageOrBuilder
    {
        int getNextAddTimestamp();
        
        int getCurBuyCount();
        
        int getCurValue();
    }
}
