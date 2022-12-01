// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class TowerCurLevelRecordChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerCurLevelRecordChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerCurLevelRecordChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerCurLevelRecordChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerCurLevelRecordChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n%TowerCurLevelRecordChangeNotify.proto\u001a\u0019TowerCurLevelRecord.proto\"Q\n\u001fTowerCurLevelRecordChangeNotify\u0012.\n\u0010cur_level_record\u0018\n \u0001(\u000b2\u0014.TowerCurLevelRecordB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerCurLevelRecordChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { TowerCurLevelRecordOuterClass.getDescriptor() });
        internal_static_TowerCurLevelRecordChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerCurLevelRecordChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_descriptor, new String[] { "CurLevelRecord" });
        TowerCurLevelRecordOuterClass.getDescriptor();
    }
    
    public static final class TowerCurLevelRecordChangeNotify extends GeneratedMessageV3 implements TowerCurLevelRecordChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUR_LEVEL_RECORD_FIELD_NUMBER = 10;
        private TowerCurLevelRecordOuterClass.TowerCurLevelRecord curLevelRecord_;
        private byte memoizedIsInitialized;
        private static final TowerCurLevelRecordChangeNotify DEFAULT_INSTANCE;
        private static final Parser<TowerCurLevelRecordChangeNotify> PARSER;
        
        private TowerCurLevelRecordChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerCurLevelRecordChangeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerCurLevelRecordChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerCurLevelRecordChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 82: {
                            TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder subBuilder = null;
                            if (this.curLevelRecord_ != null) {
                                subBuilder = this.curLevelRecord_.toBuilder();
                            }
                            this.curLevelRecord_ = input.readMessage(TowerCurLevelRecordOuterClass.TowerCurLevelRecord.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.curLevelRecord_);
                                this.curLevelRecord_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerCurLevelRecordChangeNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasCurLevelRecord() {
            return this.curLevelRecord_ != null;
        }
        
        @Override
        public TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord() {
            return (this.curLevelRecord_ == null) ? TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : this.curLevelRecord_;
        }
        
        @Override
        public TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder() {
            return this.getCurLevelRecord();
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
            if (this.curLevelRecord_ != null) {
                output.writeMessage(10, this.getCurLevelRecord());
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
            if (this.curLevelRecord_ != null) {
                size += CodedOutputStream.computeMessageSize(10, this.getCurLevelRecord());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerCurLevelRecordChangeNotify)) {
                return super.equals(obj);
            }
            final TowerCurLevelRecordChangeNotify other = (TowerCurLevelRecordChangeNotify)obj;
            return this.hasCurLevelRecord() == other.hasCurLevelRecord() && (!this.hasCurLevelRecord() || this.getCurLevelRecord().equals(other.getCurLevelRecord())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCurLevelRecord()) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getCurLevelRecord().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerCurLevelRecordChangeNotify.PARSER.parseFrom(data);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerCurLevelRecordChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerCurLevelRecordChangeNotify.PARSER.parseFrom(data);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerCurLevelRecordChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerCurLevelRecordChangeNotify.PARSER.parseFrom(data);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerCurLevelRecordChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerCurLevelRecordChangeNotify.PARSER, input);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerCurLevelRecordChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static TowerCurLevelRecordChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerCurLevelRecordChangeNotify.PARSER, input);
        }
        
        public static TowerCurLevelRecordChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerCurLevelRecordChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerCurLevelRecordChangeNotify.PARSER, input);
        }
        
        public static TowerCurLevelRecordChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerCurLevelRecordChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerCurLevelRecordChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerCurLevelRecordChangeNotify prototype) {
            return TowerCurLevelRecordChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerCurLevelRecordChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerCurLevelRecordChangeNotify getDefaultInstance() {
            return TowerCurLevelRecordChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerCurLevelRecordChangeNotify> parser() {
            return TowerCurLevelRecordChangeNotify.PARSER;
        }
        
        @Override
        public Parser<TowerCurLevelRecordChangeNotify> getParserForType() {
            return TowerCurLevelRecordChangeNotify.PARSER;
        }
        
        @Override
        public TowerCurLevelRecordChangeNotify getDefaultInstanceForType() {
            return TowerCurLevelRecordChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerCurLevelRecordChangeNotify();
            PARSER = new AbstractParser<TowerCurLevelRecordChangeNotify>() {
                @Override
                public TowerCurLevelRecordChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerCurLevelRecordChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerCurLevelRecordChangeNotifyOrBuilder
        {
            private TowerCurLevelRecordOuterClass.TowerCurLevelRecord curLevelRecord_;
            private SingleFieldBuilderV3<TowerCurLevelRecordOuterClass.TowerCurLevelRecord, TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder> curLevelRecordBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerCurLevelRecordChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerCurLevelRecordChangeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.curLevelRecordBuilder_ == null) {
                    this.curLevelRecord_ = null;
                }
                else {
                    this.curLevelRecord_ = null;
                    this.curLevelRecordBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_descriptor;
            }
            
            @Override
            public TowerCurLevelRecordChangeNotify getDefaultInstanceForType() {
                return TowerCurLevelRecordChangeNotify.getDefaultInstance();
            }
            
            @Override
            public TowerCurLevelRecordChangeNotify build() {
                final TowerCurLevelRecordChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerCurLevelRecordChangeNotify buildPartial() {
                final TowerCurLevelRecordChangeNotify result = new TowerCurLevelRecordChangeNotify(this);
                if (this.curLevelRecordBuilder_ == null) {
                    result.curLevelRecord_ = this.curLevelRecord_;
                }
                else {
                    result.curLevelRecord_ = this.curLevelRecordBuilder_.build();
                }
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
                if (other instanceof TowerCurLevelRecordChangeNotify) {
                    return this.mergeFrom((TowerCurLevelRecordChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerCurLevelRecordChangeNotify other) {
                if (other == TowerCurLevelRecordChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasCurLevelRecord()) {
                    this.mergeCurLevelRecord(other.getCurLevelRecord());
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
                TowerCurLevelRecordChangeNotify parsedMessage = null;
                try {
                    parsedMessage = TowerCurLevelRecordChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerCurLevelRecordChangeNotify)e.getUnfinishedMessage();
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
            public boolean hasCurLevelRecord() {
                return this.curLevelRecordBuilder_ != null || this.curLevelRecord_ != null;
            }
            
            @Override
            public TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord() {
                if (this.curLevelRecordBuilder_ == null) {
                    return (this.curLevelRecord_ == null) ? TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : this.curLevelRecord_;
                }
                return this.curLevelRecordBuilder_.getMessage();
            }
            
            public Builder setCurLevelRecord(final TowerCurLevelRecordOuterClass.TowerCurLevelRecord value) {
                if (this.curLevelRecordBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.curLevelRecord_ = value;
                    this.onChanged();
                }
                else {
                    this.curLevelRecordBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setCurLevelRecord(final TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder builderForValue) {
                if (this.curLevelRecordBuilder_ == null) {
                    this.curLevelRecord_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.curLevelRecordBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeCurLevelRecord(final TowerCurLevelRecordOuterClass.TowerCurLevelRecord value) {
                if (this.curLevelRecordBuilder_ == null) {
                    if (this.curLevelRecord_ != null) {
                        this.curLevelRecord_ = TowerCurLevelRecordOuterClass.TowerCurLevelRecord.newBuilder(this.curLevelRecord_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.curLevelRecord_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.curLevelRecordBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearCurLevelRecord() {
                if (this.curLevelRecordBuilder_ == null) {
                    this.curLevelRecord_ = null;
                    this.onChanged();
                }
                else {
                    this.curLevelRecord_ = null;
                    this.curLevelRecordBuilder_ = null;
                }
                return this;
            }
            
            public TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder getCurLevelRecordBuilder() {
                this.onChanged();
                return this.getCurLevelRecordFieldBuilder().getBuilder();
            }
            
            @Override
            public TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder() {
                if (this.curLevelRecordBuilder_ != null) {
                    return this.curLevelRecordBuilder_.getMessageOrBuilder();
                }
                return (this.curLevelRecord_ == null) ? TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : this.curLevelRecord_;
            }
            
            private SingleFieldBuilderV3<TowerCurLevelRecordOuterClass.TowerCurLevelRecord, TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder> getCurLevelRecordFieldBuilder() {
                if (this.curLevelRecordBuilder_ == null) {
                    this.curLevelRecordBuilder_ = new SingleFieldBuilderV3<TowerCurLevelRecordOuterClass.TowerCurLevelRecord, TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder>(this.getCurLevelRecord(), this.getParentForChildren(), this.isClean());
                    this.curLevelRecord_ = null;
                }
                return this.curLevelRecordBuilder_;
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
    
    public interface TowerCurLevelRecordChangeNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasCurLevelRecord();
        
        TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord();
        
        TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder();
    }
}
