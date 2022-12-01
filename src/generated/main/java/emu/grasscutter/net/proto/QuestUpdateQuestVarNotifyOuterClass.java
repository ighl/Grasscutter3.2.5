// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class QuestUpdateQuestVarNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_QuestUpdateQuestVarNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QuestUpdateQuestVarNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QuestUpdateQuestVarNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QuestUpdateQuestVarNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fQuestUpdateQuestVarNotify.proto\"e\n\u0019QuestUpdateQuestVarNotify\u0012\u0011\n\tquest_var\u0018\u0001 \u0003(\u0005\u0012\u0017\n\u000fparent_quest_id\u0018\f \u0001(\r\u0012\u001c\n\u0014parent_quest_var_seq\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QuestUpdateQuestVarNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_QuestUpdateQuestVarNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QuestUpdateQuestVarNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_descriptor, new String[] { "QuestVar", "ParentQuestId", "ParentQuestVarSeq" });
    }
    
    public static final class QuestUpdateQuestVarNotify extends GeneratedMessageV3 implements QuestUpdateQuestVarNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int QUEST_VAR_FIELD_NUMBER = 1;
        private Internal.IntList questVar_;
        private int questVarMemoizedSerializedSize;
        public static final int PARENT_QUEST_ID_FIELD_NUMBER = 12;
        private int parentQuestId_;
        public static final int PARENT_QUEST_VAR_SEQ_FIELD_NUMBER = 8;
        private int parentQuestVarSeq_;
        private byte memoizedIsInitialized;
        private static final QuestUpdateQuestVarNotify DEFAULT_INSTANCE;
        private static final Parser<QuestUpdateQuestVarNotify> PARSER;
        
        private QuestUpdateQuestVarNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.questVarMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private QuestUpdateQuestVarNotify() {
            this.questVarMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.questVar_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QuestUpdateQuestVarNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QuestUpdateQuestVarNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.questVar_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.questVar_.addInt(input.readInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.questVar_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.questVar_.addInt(input.readInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 64: {
                            this.parentQuestVarSeq_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.parentQuestId_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.questVar_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestUpdateQuestVarNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getQuestVarList() {
            return this.questVar_;
        }
        
        @Override
        public int getQuestVarCount() {
            return this.questVar_.size();
        }
        
        @Override
        public int getQuestVar(final int index) {
            return this.questVar_.getInt(index);
        }
        
        @Override
        public int getParentQuestId() {
            return this.parentQuestId_;
        }
        
        @Override
        public int getParentQuestVarSeq() {
            return this.parentQuestVarSeq_;
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
            this.getSerializedSize();
            if (this.getQuestVarList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.questVarMemoizedSerializedSize);
            }
            for (int i = 0; i < this.questVar_.size(); ++i) {
                output.writeInt32NoTag(this.questVar_.getInt(i));
            }
            if (this.parentQuestVarSeq_ != 0) {
                output.writeUInt32(8, this.parentQuestVarSeq_);
            }
            if (this.parentQuestId_ != 0) {
                output.writeUInt32(12, this.parentQuestId_);
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
            int dataSize = 0;
            for (int i = 0; i < this.questVar_.size(); ++i) {
                dataSize += CodedOutputStream.computeInt32SizeNoTag(this.questVar_.getInt(i));
            }
            size += dataSize;
            if (!this.getQuestVarList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.questVarMemoizedSerializedSize = dataSize;
            if (this.parentQuestVarSeq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.parentQuestVarSeq_);
            }
            if (this.parentQuestId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.parentQuestId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QuestUpdateQuestVarNotify)) {
                return super.equals(obj);
            }
            final QuestUpdateQuestVarNotify other = (QuestUpdateQuestVarNotify)obj;
            return this.getQuestVarList().equals(other.getQuestVarList()) && this.getParentQuestId() == other.getParentQuestId() && this.getParentQuestVarSeq() == other.getParentQuestVarSeq() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getQuestVarCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getQuestVarList().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getParentQuestId();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getParentQuestVarSeq();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarNotify.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarNotify.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarNotify.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarNotify.PARSER, input);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarNotify.PARSER, input, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestUpdateQuestVarNotify.PARSER, input);
        }
        
        public static QuestUpdateQuestVarNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestUpdateQuestVarNotify.PARSER, input, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarNotify.PARSER, input);
        }
        
        public static QuestUpdateQuestVarNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QuestUpdateQuestVarNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QuestUpdateQuestVarNotify prototype) {
            return QuestUpdateQuestVarNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QuestUpdateQuestVarNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QuestUpdateQuestVarNotify getDefaultInstance() {
            return QuestUpdateQuestVarNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<QuestUpdateQuestVarNotify> parser() {
            return QuestUpdateQuestVarNotify.PARSER;
        }
        
        @Override
        public Parser<QuestUpdateQuestVarNotify> getParserForType() {
            return QuestUpdateQuestVarNotify.PARSER;
        }
        
        @Override
        public QuestUpdateQuestVarNotify getDefaultInstanceForType() {
            return QuestUpdateQuestVarNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QuestUpdateQuestVarNotify();
            PARSER = new AbstractParser<QuestUpdateQuestVarNotify>() {
                @Override
                public QuestUpdateQuestVarNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QuestUpdateQuestVarNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuestUpdateQuestVarNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList questVar_;
            private int parentQuestId_;
            private int parentQuestVarSeq_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestUpdateQuestVarNotify.class, Builder.class);
            }
            
            private Builder() {
                this.questVar_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.questVar_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QuestUpdateQuestVarNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.questVar_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.parentQuestId_ = 0;
                this.parentQuestVarSeq_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QuestUpdateQuestVarNotifyOuterClass.internal_static_QuestUpdateQuestVarNotify_descriptor;
            }
            
            @Override
            public QuestUpdateQuestVarNotify getDefaultInstanceForType() {
                return QuestUpdateQuestVarNotify.getDefaultInstance();
            }
            
            @Override
            public QuestUpdateQuestVarNotify build() {
                final QuestUpdateQuestVarNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QuestUpdateQuestVarNotify buildPartial() {
                final QuestUpdateQuestVarNotify result = new QuestUpdateQuestVarNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.questVar_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.questVar_ = this.questVar_;
                result.parentQuestId_ = this.parentQuestId_;
                result.parentQuestVarSeq_ = this.parentQuestVarSeq_;
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
                if (other instanceof QuestUpdateQuestVarNotify) {
                    return this.mergeFrom((QuestUpdateQuestVarNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QuestUpdateQuestVarNotify other) {
                if (other == QuestUpdateQuestVarNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.questVar_.isEmpty()) {
                    if (this.questVar_.isEmpty()) {
                        this.questVar_ = other.questVar_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureQuestVarIsMutable();
                        this.questVar_.addAll(other.questVar_);
                    }
                    this.onChanged();
                }
                if (other.getParentQuestId() != 0) {
                    this.setParentQuestId(other.getParentQuestId());
                }
                if (other.getParentQuestVarSeq() != 0) {
                    this.setParentQuestVarSeq(other.getParentQuestVarSeq());
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
                QuestUpdateQuestVarNotify parsedMessage = null;
                try {
                    parsedMessage = QuestUpdateQuestVarNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QuestUpdateQuestVarNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureQuestVarIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.questVar_ = GeneratedMessageV3.mutableCopy(this.questVar_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getQuestVarList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.questVar_) : this.questVar_;
            }
            
            @Override
            public int getQuestVarCount() {
                return this.questVar_.size();
            }
            
            @Override
            public int getQuestVar(final int index) {
                return this.questVar_.getInt(index);
            }
            
            public Builder setQuestVar(final int index, final int value) {
                this.ensureQuestVarIsMutable();
                this.questVar_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addQuestVar(final int value) {
                this.ensureQuestVarIsMutable();
                this.questVar_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllQuestVar(final Iterable<? extends Integer> values) {
                this.ensureQuestVarIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.questVar_);
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestVar() {
                this.questVar_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentQuestId() {
                return this.parentQuestId_;
            }
            
            public Builder setParentQuestId(final int value) {
                this.parentQuestId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestId() {
                this.parentQuestId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentQuestVarSeq() {
                return this.parentQuestVarSeq_;
            }
            
            public Builder setParentQuestVarSeq(final int value) {
                this.parentQuestVarSeq_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestVarSeq() {
                this.parentQuestVarSeq_ = 0;
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
    
    public interface QuestUpdateQuestVarNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getQuestVarList();
        
        int getQuestVarCount();
        
        int getQuestVar(final int p0);
        
        int getParentQuestId();
        
        int getParentQuestVarSeq();
    }
}
