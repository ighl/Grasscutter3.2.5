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

public final class BattlePassCurScheduleUpdateNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassCurScheduleUpdateNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassCurScheduleUpdateNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n'BattlePassCurScheduleUpdateNotify.proto\u001a\u0018BattlePassSchedule.proto\"i\n!BattlePassCurScheduleUpdateNotify\u0012\u0019\n\u0011have_cur_schedule\u0018\u000b \u0001(\b\u0012)\n\fcur_schedule\u0018\u0001 \u0001(\u000b2\u0013.BattlePassScheduleB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassCurScheduleUpdateNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BattlePassScheduleOuterClass.getDescriptor() });
        internal_static_BattlePassCurScheduleUpdateNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor, new String[] { "HaveCurSchedule", "CurSchedule" });
        BattlePassScheduleOuterClass.getDescriptor();
    }
    
    public static final class BattlePassCurScheduleUpdateNotify extends GeneratedMessageV3 implements BattlePassCurScheduleUpdateNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int HAVE_CUR_SCHEDULE_FIELD_NUMBER = 11;
        private boolean haveCurSchedule_;
        public static final int CUR_SCHEDULE_FIELD_NUMBER = 1;
        private BattlePassScheduleOuterClass.BattlePassSchedule curSchedule_;
        private byte memoizedIsInitialized;
        private static final BattlePassCurScheduleUpdateNotify DEFAULT_INSTANCE;
        private static final Parser<BattlePassCurScheduleUpdateNotify> PARSER;
        
        private BattlePassCurScheduleUpdateNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassCurScheduleUpdateNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassCurScheduleUpdateNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassCurScheduleUpdateNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            BattlePassScheduleOuterClass.BattlePassSchedule.Builder subBuilder = null;
                            if (this.curSchedule_ != null) {
                                subBuilder = this.curSchedule_.toBuilder();
                            }
                            this.curSchedule_ = input.readMessage(BattlePassScheduleOuterClass.BattlePassSchedule.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.curSchedule_);
                                this.curSchedule_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 88: {
                            this.haveCurSchedule_ = input.readBool();
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
            return BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassCurScheduleUpdateNotify.class, Builder.class);
        }
        
        @Override
        public boolean getHaveCurSchedule() {
            return this.haveCurSchedule_;
        }
        
        @Override
        public boolean hasCurSchedule() {
            return this.curSchedule_ != null;
        }
        
        @Override
        public BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule() {
            return (this.curSchedule_ == null) ? BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : this.curSchedule_;
        }
        
        @Override
        public BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder() {
            return this.getCurSchedule();
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
            if (this.curSchedule_ != null) {
                output.writeMessage(1, this.getCurSchedule());
            }
            if (this.haveCurSchedule_) {
                output.writeBool(11, this.haveCurSchedule_);
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
            if (this.curSchedule_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getCurSchedule());
            }
            if (this.haveCurSchedule_) {
                size += CodedOutputStream.computeBoolSize(11, this.haveCurSchedule_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassCurScheduleUpdateNotify)) {
                return super.equals(obj);
            }
            final BattlePassCurScheduleUpdateNotify other = (BattlePassCurScheduleUpdateNotify)obj;
            return this.getHaveCurSchedule() == other.getHaveCurSchedule() && this.hasCurSchedule() == other.hasCurSchedule() && (!this.hasCurSchedule() || this.getCurSchedule().equals(other.getCurSchedule())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getHaveCurSchedule());
            if (this.hasCurSchedule()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getCurSchedule().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassCurScheduleUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassCurScheduleUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassCurScheduleUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassCurScheduleUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassCurScheduleUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassCurScheduleUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassCurScheduleUpdateNotify.PARSER, input);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassCurScheduleUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassCurScheduleUpdateNotify.PARSER, input);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassCurScheduleUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassCurScheduleUpdateNotify.PARSER, input);
        }
        
        public static BattlePassCurScheduleUpdateNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassCurScheduleUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassCurScheduleUpdateNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassCurScheduleUpdateNotify prototype) {
            return BattlePassCurScheduleUpdateNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassCurScheduleUpdateNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassCurScheduleUpdateNotify getDefaultInstance() {
            return BattlePassCurScheduleUpdateNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassCurScheduleUpdateNotify> parser() {
            return BattlePassCurScheduleUpdateNotify.PARSER;
        }
        
        @Override
        public Parser<BattlePassCurScheduleUpdateNotify> getParserForType() {
            return BattlePassCurScheduleUpdateNotify.PARSER;
        }
        
        @Override
        public BattlePassCurScheduleUpdateNotify getDefaultInstanceForType() {
            return BattlePassCurScheduleUpdateNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassCurScheduleUpdateNotify();
            PARSER = new AbstractParser<BattlePassCurScheduleUpdateNotify>() {
                @Override
                public BattlePassCurScheduleUpdateNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassCurScheduleUpdateNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassCurScheduleUpdateNotifyOrBuilder
        {
            private boolean haveCurSchedule_;
            private BattlePassScheduleOuterClass.BattlePassSchedule curSchedule_;
            private SingleFieldBuilderV3<BattlePassScheduleOuterClass.BattlePassSchedule, BattlePassScheduleOuterClass.BattlePassSchedule.Builder, BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder> curScheduleBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassCurScheduleUpdateNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassCurScheduleUpdateNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.haveCurSchedule_ = false;
                if (this.curScheduleBuilder_ == null) {
                    this.curSchedule_ = null;
                }
                else {
                    this.curSchedule_ = null;
                    this.curScheduleBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
            }
            
            @Override
            public BattlePassCurScheduleUpdateNotify getDefaultInstanceForType() {
                return BattlePassCurScheduleUpdateNotify.getDefaultInstance();
            }
            
            @Override
            public BattlePassCurScheduleUpdateNotify build() {
                final BattlePassCurScheduleUpdateNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassCurScheduleUpdateNotify buildPartial() {
                final BattlePassCurScheduleUpdateNotify result = new BattlePassCurScheduleUpdateNotify(this);
                result.haveCurSchedule_ = this.haveCurSchedule_;
                if (this.curScheduleBuilder_ == null) {
                    result.curSchedule_ = this.curSchedule_;
                }
                else {
                    result.curSchedule_ = this.curScheduleBuilder_.build();
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
                if (other instanceof BattlePassCurScheduleUpdateNotify) {
                    return this.mergeFrom((BattlePassCurScheduleUpdateNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassCurScheduleUpdateNotify other) {
                if (other == BattlePassCurScheduleUpdateNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getHaveCurSchedule()) {
                    this.setHaveCurSchedule(other.getHaveCurSchedule());
                }
                if (other.hasCurSchedule()) {
                    this.mergeCurSchedule(other.getCurSchedule());
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
                BattlePassCurScheduleUpdateNotify parsedMessage = null;
                try {
                    parsedMessage = BattlePassCurScheduleUpdateNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassCurScheduleUpdateNotify)e.getUnfinishedMessage();
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
            public boolean getHaveCurSchedule() {
                return this.haveCurSchedule_;
            }
            
            public Builder setHaveCurSchedule(final boolean value) {
                this.haveCurSchedule_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHaveCurSchedule() {
                this.haveCurSchedule_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasCurSchedule() {
                return this.curScheduleBuilder_ != null || this.curSchedule_ != null;
            }
            
            @Override
            public BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule() {
                if (this.curScheduleBuilder_ == null) {
                    return (this.curSchedule_ == null) ? BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : this.curSchedule_;
                }
                return this.curScheduleBuilder_.getMessage();
            }
            
            public Builder setCurSchedule(final BattlePassScheduleOuterClass.BattlePassSchedule value) {
                if (this.curScheduleBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.curSchedule_ = value;
                    this.onChanged();
                }
                else {
                    this.curScheduleBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setCurSchedule(final BattlePassScheduleOuterClass.BattlePassSchedule.Builder builderForValue) {
                if (this.curScheduleBuilder_ == null) {
                    this.curSchedule_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.curScheduleBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeCurSchedule(final BattlePassScheduleOuterClass.BattlePassSchedule value) {
                if (this.curScheduleBuilder_ == null) {
                    if (this.curSchedule_ != null) {
                        this.curSchedule_ = BattlePassScheduleOuterClass.BattlePassSchedule.newBuilder(this.curSchedule_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.curSchedule_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.curScheduleBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearCurSchedule() {
                if (this.curScheduleBuilder_ == null) {
                    this.curSchedule_ = null;
                    this.onChanged();
                }
                else {
                    this.curSchedule_ = null;
                    this.curScheduleBuilder_ = null;
                }
                return this;
            }
            
            public BattlePassScheduleOuterClass.BattlePassSchedule.Builder getCurScheduleBuilder() {
                this.onChanged();
                return this.getCurScheduleFieldBuilder().getBuilder();
            }
            
            @Override
            public BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder() {
                if (this.curScheduleBuilder_ != null) {
                    return this.curScheduleBuilder_.getMessageOrBuilder();
                }
                return (this.curSchedule_ == null) ? BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : this.curSchedule_;
            }
            
            private SingleFieldBuilderV3<BattlePassScheduleOuterClass.BattlePassSchedule, BattlePassScheduleOuterClass.BattlePassSchedule.Builder, BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder> getCurScheduleFieldBuilder() {
                if (this.curScheduleBuilder_ == null) {
                    this.curScheduleBuilder_ = new SingleFieldBuilderV3<BattlePassScheduleOuterClass.BattlePassSchedule, BattlePassScheduleOuterClass.BattlePassSchedule.Builder, BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder>(this.getCurSchedule(), this.getParentForChildren(), this.isClean());
                    this.curSchedule_ = null;
                }
                return this.curScheduleBuilder_;
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
    
    public interface BattlePassCurScheduleUpdateNotifyOrBuilder extends MessageOrBuilder
    {
        boolean getHaveCurSchedule();
        
        boolean hasCurSchedule();
        
        BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule();
        
        BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder();
    }
}
